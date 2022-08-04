package com.josh.java.training.collection.set.hashset;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

	int bid;
	String title;
	double price;

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", title=" + title + ", price=" + price + "]";
	}

	public boolean equals(Object o) {
		Book temp = (Book) o;

		return this.bid == temp.bid && this.title.equals(temp.title) && this.price == temp.price;
	}

	public int hashCode() {
		int hc = 0;
		hc = hc + bid;
		hc = hc + title.hashCode();
		hc = hc + Double.valueOf(price).hashCode();
		return hc;
	}

}
