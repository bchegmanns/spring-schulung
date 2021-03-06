package de.hegmanns.spring.schulung.demo.hallowelt.mitspring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;

import de.hegmanns.spring.schulung.demo.hallowelt.ohnespring.HalloWelt;
import de.hegmanns.spring.schulung.demo.hallowelt.ohnespring.extended.MessageRenderer;

public class HalloWeltApplikationMitSpring {

	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("hallowelt-spring.xml"));
//		MessageRenderer renderer = beanFactory.getBean("renderer", MessageRenderer.class);
//		renderer = (MessageRenderer) beanFactory.getBean("renderer");
//		renderer = beanFactory.getBean(MessageRenderer.class);
		
//		renderer.render();
		
		HalloWeltUser myUser = beanFactory.getBean(HalloWeltUser.class);
		myUser.work();
	}

}
