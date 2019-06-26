package com.example.airbnbapi.entities;

public class Property {
	int id;
	String label;
	String description;
	String type;
	boolean isPlus;
	int totalGuests;
	Room[] rooms;
	Bath[] baths;
	Image[] images;
	Amenity[] amenities;
	Accessibility[] accessibilities;
	Address location;
	Review[] reviews;
	Owner owner;
	HouseRule[] houseRules;
	String cancellationPolicy;
	int rating;
	int raters;
	String currency;
	int price;


	public Property(int id, String label, String description, String type, boolean isPlus, int totalGuests, Room[] rooms, Bath[] baths, Image[] images, Amenity[] amenities, Accessibility[] accessibilities, Address location, Review[] reviews, Owner owner, HouseRule[] houseRules, String cancellationPolicy, int rating, int raters, String currency, int price) {
		this.id = id;
		this.label = label;
		this.description = description;
		this.type = type;
		this.isPlus = isPlus;
		this.totalGuests = totalGuests;
		this.rooms = rooms;
		this.baths = baths;
		this.images = images;
		this.amenities = amenities;
		this.accessibilities = accessibilities;
		this.location = location;
		this.reviews = reviews;
		this.owner = owner;
		this.houseRules = houseRules;
		this.cancellationPolicy = cancellationPolicy;
		this.rating = rating;
		this.raters = raters;
		this.currency = currency;
		this.price = price;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isIsPlus() {
		return this.isPlus;
	}

	public boolean getIsPlus() {
		return this.isPlus;
	}

	public void setIsPlus(boolean isPlus) {
		this.isPlus = isPlus;
	}

	public int getTotalGuests() {
		return this.totalGuests;
	}

	public void setTotalGuests(int totalGuests) {
		this.totalGuests = totalGuests;
	}

	public Room[] getRooms() {
		return this.rooms;
	}

	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}

	public Bath[] getBaths() {
		return this.baths;
	}

	public void setBaths(Bath[] baths) {
		this.baths = baths;
	}

	public Image[] getImages() {
		return this.images;
	}

	public void setImages(Image[] images) {
		this.images = images;
	}

	public Amenity[] getAmenities() {
		return this.amenities;
	}

	public void setAmenities(Amenity[] amenities) {
		this.amenities = amenities;
	}

	public Accessibility[] getAccessibilities() {
		return this.accessibilities;
	}

	public void setAccessibilities(Accessibility[] accessibilities) {
		this.accessibilities = accessibilities;
	}

	public Address getLocation() {
		return this.location;
	}

	public void setLocation(Address location) {
		this.location = location;
	}

	public Review[] getReviews() {
		return this.reviews;
	}

	public void setReviews(Review[] reviews) {
		this.reviews = reviews;
	}

	public Owner getOwner() {
		return this.owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public HouseRule[] getHouseRules() {
		return this.houseRules;
	}

	public void setHouseRules(HouseRule[] houseRules) {
		this.houseRules = houseRules;
	}

	public String getCancellationPolicy() {
		return this.cancellationPolicy;
	}

	public void setCancellationPolicy(String cancellationPolicy) {
		this.cancellationPolicy = cancellationPolicy;
	}

	public int getRating() {
		return this.rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getRaters() {
		return this.raters;
	}

	public void setRaters(int raters) {
		this.raters = raters;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
