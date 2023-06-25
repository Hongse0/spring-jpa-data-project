package com.seyeong.finaljpa.info.controller;

import com.seyeong.finaljpa.info.common.Pagenation;
import com.seyeong.finaljpa.info.common.PagingButtonInfo;
import com.seyeong.finaljpa.info.dto.CountriesDTO;
import com.seyeong.finaljpa.info.dto.PlayersDTO;
import com.seyeong.finaljpa.info.service.InfoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/info")
public class InfoController {

    private final InfoService infoService;

    public InfoController(InfoService infoService){
        this.infoService = infoService;
    }

    @GetMapping("/allplayer")
    public String allPlayerList(@PageableDefault Pageable pageable,Model model){

        Page<PlayersDTO> playerList = infoService.findAllPlayers(pageable);

        PagingButtonInfo paging = Pagenation.getPagingButtonInfo(playerList);
        model.addAttribute("paging", paging);
        model.addAttribute("playerList",playerList);

        return "info/allplayer";
    }

    @GetMapping(value = "countries", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<CountriesDTO> findCountryList(){


        return infoService.findCountryPlayer();
    }
    @GetMapping("/countryPlayer")
    public String findCountryPlayer(){

        return "info/countryPlayer";
    }

    @GetMapping("search")
    public String resultPlayer(@RequestParam Integer countryId, Model model){

        List<PlayersDTO> playerList = infoService.findCountryPlayer2(countryId);
        model.addAttribute("playerList", playerList);
        return "info/searchResult";
    }
    @GetMapping("/regist")
    public void registPage() {}

    @PostMapping("/regist")
    public String registPlayer(PlayersDTO player){


        infoService.registPlayers(player);

        return "redirect:/info/allplayer";
    }

    @GetMapping("/deletePlayer")
    public void deletePage(){}

    @PostMapping("/delete")
    public String deletePlayer(@RequestParam String playerName){
        infoService.deletePlayer(playerName);
        return "redirect:/info/allplayer";
    }

    @GetMapping("/modifyPlayer")
    public void modifyPage(){}

    @PostMapping("/modify")
    public String modifyPlayer(PlayersDTO player){
        infoService.modifyPlayer(player);

        return "redirect:/info/"+player.getPlayerId();
    }

    @GetMapping("/{playerId}")
    public String findByPlayerId(@PathVariable int playerId, Model model){
        PlayersDTO player = infoService.findByPlayerId(playerId);
        model.addAttribute("players",player);


        return "info/onePlayer";
    }

    @GetMapping("/countryList")
    public String allCountryList(Model model){

        List<CountriesDTO> countries = infoService.findAllCountry();

        model.addAttribute("countryList",countries);

        return "info/countryList";
    }



}
