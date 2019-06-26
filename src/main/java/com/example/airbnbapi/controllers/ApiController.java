package com.example.airbnbapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.airbnbapi.entities.Property;
import com.example.airbnbapi.entities.Accessibility;
import com.example.airbnbapi.entities.Address;
import com.example.airbnbapi.entities.Amenity;
import com.example.airbnbapi.entities.Bath;
import com.example.airbnbapi.entities.Bed;
import com.example.airbnbapi.entities.HouseRule;
import com.example.airbnbapi.entities.Image;
import com.example.airbnbapi.entities.Owner;
import com.example.airbnbapi.entities.Review;
import com.example.airbnbapi.entities.Room;

@RestController
@RequestMapping(path="/api")
public class ApiController {
	
	@GetMapping(path="/", produces="application/json")
	public Property getProperty() {

		Bed[] beds = {
			new Bed(1, "Double", 1),
			new Bed(2, "Single", 1)
		};

		Room[] rooms = {
			new Room(1, "Private", beds)
		};

		Bath[] baths = {
			new Bath(1, "Private", 1)
		};

		Image[] images = {
			new Image(1, "Main", "https://images.unsplash.com/photo-1558981420-bf351ce8e3ca?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=600&q=60"),
			new Image(2, "Private living room", "https://images.unsplash.com/photo-1561028526-675bc91a7dc4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=600&q=60"),
			new Image(3, "Private bedroom . Double bed", "https://images.unsplash.com/photo-1556228578-8c89e6adf883?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=600&q=60"),
			new Image(4, "Private kitchenette", "https://images.unsplash.com/photo-1561013029-87d2eb34d0d8?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=600&q=60"),
			new Image(5, "Private full bathroom", "https://images.unsplash.com/photo-1561023746-ee4b371dbc57?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=600&q=60")
			
		};

		Amenity[] amenities = {
			new Amenity(1, "Self check-in", "https://images.unsplash.com/photo-1560982535-53d62646d312?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=600&q=60"),
			new Amenity(2, "Kitchenette", "https://images.unsplash.com/photo-1560969184-f606db3f70bb?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=600&q=60"),
			new Amenity(3, "Wifi", "https://images.unsplash.com/photo-1560983073-c29bff7438ef?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=600&q=60"),
			new Amenity(4, "TV", "https://images.unsplash.com/photo-1560942811-f84e38f686ea?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=600&q=60"),
			new Amenity(5, "Bathroom essentials", "https://images.unsplash.com/photo-1560887189-3d1c8a43b1b8?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=600&q=60"),
			new Amenity(6, "Bedroom comforts", "https://images.unsplash.com/photo-1560943026-1c6dd85171f0?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=600&q=60")
		};

		Accessibility[] accessibilities = {
			new Accessibility(1, "Flat path to guest entrance")
		};

		Address location = new Address(1, "Test Line 1", "Test Line 2", "Oxford Street", "12345", "London", "United Kingdom");

		Review[] reviews = {
			new Review(1, "Very convenient location. It was easy to get around and enjoy the city.", "Tabatha", "2 months ago"),
			new Review(2, "The Airbnb is everything and more. It has the best of amenities and is a 10 minute walk from the oval station that can take you anywhere in London. It is also a 2 minute walk from a bus stop that is very well connected.", "Manuela", "3 months ago"),
			new Review(2, "You will love Nicholas and Michele’s modern apartment. It has everything you need to make your trip a memorable one. We were so pleased that there was a grocery store around the corner and we were close to the underground.", "Dawn", "4 months ago")
		};

		Owner host = new Owner(1, "Nicholas & Michele", "Artist from London and interior designer. I am English/German and my partner is Italian. I have been living in London for over 18 years...", "May 2013", "English Deutsch", 100, "within an hour", "Nicholas@gmail.com", "987654321");

		HouseRule[] houseRules = {
			new HouseRule(1, "General", "Not suitable for infants (under 2 years)"),
			new HouseRule(2, "General", "No smoking"),
			new HouseRule(3, "General", "No pets"),
			new HouseRule(4, "Special", "Security Deposit - if you damage the home, you may be charged up to RM923")
		};

		Property property = new Property(1, 
		"Chic Room with Bath and Kitchenette Living Area", 
		"Enjoy the central location and easy accessibility to public transit from this stylish, ground floor studio. Inside the private room, admire details like the full-height mural, complete mosaic bathroom, and soft, woven textiles maximising comfort.", 
		"Private", true, 3, rooms, baths, images, amenities, accessibilities, location, reviews, host, houseRules, "Moderate", 5, 257, "RM", 438);
		
		return property;
	}

}
