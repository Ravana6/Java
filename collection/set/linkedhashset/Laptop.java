package com.josh.java.training.collection.set.linkedhashset;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Laptop {
	int ram;
	int hardisk;

	public Laptop(int ram, int hardisk) {
		this.ram = ram;
		this.hardisk = hardisk;
	}
}
