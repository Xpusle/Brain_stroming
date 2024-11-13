package com.example.Brain_stroming.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Brain_stroming.Service.PlayerService;
import com.example.Brain_stroming.model.Player;

@Controller // Changed to @Controller to handle both form submissions and web page rendering
@RequestMapping("/fifa.com")
public class PlayerController {

    @Autowired
    PlayerService pal;

    // Method to handle form submissions from HTML and save the data to the database
    @PostMapping("/submit")
    public String submitPlayerData(@ModelAttribute Player player) {
        pal.Upsert(player);
        return "redirect:/success"; // Redirects to a success page after saving
    }

    // REST endpoint to get a player by their age
    @GetMapping("/{Age}")
    public ResponseEntity<Player> GetPlayerbyid(@PathVariable Integer Age) {
        Player pl = pal.GetplayerbyAge(Age);
        if (pl != null) {
            return new ResponseEntity<>(pl, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // REST endpoint to get all players
    @GetMapping("/Allplayers")
    public ResponseEntity<List<Player>> GetAllPlayer() {
        List<Player> pll = pal.GetAllplayers();
        return new ResponseEntity<>(pll, HttpStatus.OK);
    }

}
