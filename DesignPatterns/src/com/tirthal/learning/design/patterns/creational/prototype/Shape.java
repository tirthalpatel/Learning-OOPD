package com.tirthal.learning.design.patterns.creational.prototype;

// An abstract class implementing Clonable interface
public abstract class Shape implements Cloneable {

	private String id;
	protected String type;

	abstract void draw();

	public String getType() {
		return type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Object clone() {
		Object clone = null;

		try {
			clone = super.clone();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return clone;
	}

	@Override
	public String toString() {
		return super.toString() + " [id=" + id + ", type=" + type + "]";
	}
}
