package com.example.Brain_stroming.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Brain_stroming.Repository.PlayerRepository;
import com.example.Brain_stroming.model.Player;

@Service
public class PlayerService {
	
	@Autowired
	PlayerRepository pr;
	
	public String Upsert(Player player) {
		pr.save(player);
		return "";
	}
	
	public Player GetplayerbyAge(Integer Age) {
		java.util.Optional<Player>pl=pr.findById(Age);
		if(pl.isPresent()) {
			return pl.get();
		}
		return null;
		
	}
	
	public List<Player> GetAllplayers(){
		return pr.findAll();
	}
	
	public String DeletePlayerbyid(Integer Age) {
		pr.deleteById(Age);
		return "";
	}
}
