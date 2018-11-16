package com.example.demo.controller;

public class Course {
	private String name;
	private int chapterCount;

	public Course(String name, int chapterCount) {
		this.setName(name);
		this.setChapterCount(chapterCount);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the chapterCount
	 */
	public int getChapterCount() {
		return chapterCount;
	}

	/**
	 * @param chapterCount the chapterCount to set
	 */
	public void setChapterCount(int chapterCount) {
		this.chapterCount = chapterCount;
	}
	
}
