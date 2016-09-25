package de.hegmanns.spring.schulung.demo.hallowelt.mitspring;

import javax.annotation.processing.Messager;

import de.hegmanns.spring.schulung.demo.hallowelt.ohnespring.extended.MessageRenderer;

/**
HalloWeltUser in No-Spring-Style
*/
public class HalloWeltUser {

	private MessageRenderer messageRenderer;
	
	
	
	public MessageRenderer getMessageRenderer() {
		return messageRenderer;
	}



	public void setMessageRenderer(MessageRenderer messageRenderer) {
		this.messageRenderer = messageRenderer;
	}



	public void work(){
		messageRenderer.render();
	}
}
