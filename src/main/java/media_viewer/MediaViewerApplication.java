package media_viewer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"media_viewer"})
public class MediaViewerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediaViewerApplication.class, args);
	}
	
/*
    @Autowired
    private DatabaseTestService databaseTestService;

    public static void main(String[] args) {
        SpringApplication.run(YourSpringBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        databaseTestService.testConnection();
    }
*/
}
