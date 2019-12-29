package js.lone.classpathResourceD;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.InputStream;

public class ResourceApp {
	public static void main(String[] args) throws Exception {
		Resource resource = new ClassPathResource("config/springConfig.xml");
		InputStream inputStream = resource.getInputStream();
		String description = resource.getDescription();
		System.err.println("description = " + description);
	}
}
