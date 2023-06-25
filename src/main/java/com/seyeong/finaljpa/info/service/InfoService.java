package com.seyeong.finaljpa.info.service;

import com.seyeong.finaljpa.info.dto.CountriesDTO;
import com.seyeong.finaljpa.info.dto.PlayersDTO;
import com.seyeong.finaljpa.info.entity.Countries;
import com.seyeong.finaljpa.info.entity.Players;
import com.seyeong.finaljpa.info.repository.CountriesRepository;
import com.seyeong.finaljpa.info.repository.PlayerRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InfoService {

   private final PlayerRepository playerRepository;
   private final CountriesRepository countriesRepository;
   private final ModelMapper modelMapper;

    public InfoService(PlayerRepository playerRepository, ModelMapper modelMapper,CountriesRepository countriesRepository) {
        this.playerRepository = playerRepository;
        this.modelMapper = modelMapper;
        this.countriesRepository = countriesRepository;
    }


    public List<PlayersDTO> findAllPlayers() {

        List<Players> playersList = playerRepository.findAll(Sort.by("playerId"));

        return  playersList.stream().map(players -> modelMapper.map(players, PlayersDTO.class))
                .collect(Collectors.toList());
    }//전체 선수 조회

    public List<CountriesDTO> findCountryPlayer() {

        List<Countries> categoryList = countriesRepository.findAllCountries();

        return categoryList.stream().map(countries -> modelMapper.map(countries, CountriesDTO.class))
                .collect(Collectors.toList());
    }// 국가 목록

    public List<PlayersDTO> findCountryPlayer2(Integer countryId) {
        Countries country = countriesRepository.findById(countryId).orElse(null);
        if (country == null) {
            // 국가가 존재하지 않는 경우 예외 처리
            throw new IllegalArgumentException("Invalid country ID: " + countryId);
        }
        List<Players> playersList = playerRepository.findByCountry(country);
        return playersList.stream()
                .map(players -> modelMapper.map(players, PlayersDTO.class))
                .collect(Collectors.toList());

    }

    @Transactional
    public void registPlayers(PlayersDTO player) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.addMappings(new PropertyMap<PlayersDTO, Players>() {
            @Override
            protected void configure() {
                map().setPlayerId(source.getPlayerId());
                map().getCountry().setCountriesId(source.getCountryId());
            }
        });
        playerRepository.save(modelMapper.map(player, Players.class));
    }

    @Transactional
    public void deletePlayer(String playerName) {

        playerRepository.deleteByName(playerName);
    }

    @Transactional
    public void modifyPlayer(PlayersDTO player) {
        Players foundPlayer = playerRepository.findById(player.getPlayerId()).orElseThrow(IllegalArgumentException::new);

        foundPlayer.setClub(player.getClub());
        foundPlayer.setCaps(player.getCaps());
        foundPlayer.setGoals(player.getGoals());
    }

    public PlayersDTO findByPlayerId(int playerId) {
        Players player = playerRepository.findById(playerId).orElseThrow(IllegalArgumentException::new);


        return modelMapper.map(player,PlayersDTO.class);
    }

    public List<CountriesDTO> findAllCountry() {
        List<Countries> countriesList = countriesRepository.findAll(Sort.by("countriesId"));

        return  countriesList.stream().map(country -> modelMapper.map(country, CountriesDTO.class))
                .collect(Collectors.toList());

    }
}
