package com.luo.spring.guides.iocdi.xml.field;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by iuliana.cosmina on 2/15/17.
 */
public class Inspiration {

	private String lyric = "I can keep the door cracked open, to let light through";

	public Inspiration(){

	}

	public Inspiration(@Value("For all my running, I can understand") String lyric) {
		this.lyric = lyric;
	}

	public String getLyric() {
		return lyric;
	}

	public void setLyric(String lyric) {
		this.lyric = lyric;
	}
}
