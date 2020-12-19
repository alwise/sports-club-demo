package com.astudio.sportsclubdemo;

import com.astudio.sportsclubdemo.entity.*;
import com.astudio.sportsclubdemo.repository.*;
import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
class SportsClubDemoApplicationTests {

	@Autowired
	private StaffRepository staffRepository;

	@Autowired
	private DrinkRepository drinkRepository;

	@Autowired
	private PlayerRepository playerRepository;

	@Autowired
	private DrinkSalesRepository drinkSalesRepository;

	@Autowired
	private GamesRepository gamesRepository;
	@Autowired
	private GameSubRepository subRepository;

	@Test
	public void addGames(){
		Games games = new Games();
		games.setName("Tennis");
		gamesRepository.save(games);
	}

	@Test
	public void addStaff(){
		Staff staff = new Staff();
		staff.setId(101);
		staff.setFirstName("Elvis");
		staff.setLastName("Kemevor");
		staffRepository.save(staff);
	}

	@Test
	public void addDrink(){
		Drink drink = new Drink();
		drink.setName("Kiss");
		drink.setPrice(10.00);
		drink.setDate(LocalDate.now().toString());
		drinkRepository.save((drink));
	}

	@Test
	public void addPlayer(){
		Player player = new Player();
		player.setFirstName("Elvis");
		player.setLastName("Kemevor");
		player.setAddress("Hello street");
		playerRepository.save(player);

	}

	@Test
	public void sellDrink(){
		Drink drink = new Drink();
		drink.setPrice(10);
		drink.setDate(LocalDate.now().toString());
		drink.setId(1);

		Player player = new Player();
		player.setId(1);

		DrinkSales drinkSales = new DrinkSales();
		drinkSales.setAmount(drink.getPrice());
		drinkSales.setDrink(drink);
		drinkSales.setQuantity(2);
		drinkSales.setDate(LocalDate.now().toString());
		drinkSales.setPlayer(player);

		drinkSalesRepository.save(drinkSales);

	}

	@Test
	public void subscribe(){
		Games games = new Games();
		games.setId(1);

		Player player = new Player();
		player.setId(1);

		GameSubscription subscription = new GameSubscription();
		subscription.setPlayer(player);
		subscription.setGame(games);
		subscription.setDate(LocalDate.now().toString());
		subRepository.save(subscription);
	}


	@Test
	public void getAll(){
	 List<GameSubscription> subs =  subRepository.findAll();
		subs.forEach(e-> System.out.println(e.getPlayer().getFirstName()));
	}



}
