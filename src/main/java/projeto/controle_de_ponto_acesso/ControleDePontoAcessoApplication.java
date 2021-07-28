package projeto.controle_de_ponto_acesso;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
public class ControleDePontoAcessoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleDePontoAcessoApplication.class, args);
	}

	@Bean //adding swagger to api documentation -> usage example: ----------------- http://localhost:8081/swagger-ui.html
	public OpenAPI customOpenAPI(@Value("CONTROLE ACESSO") String description){
		return new OpenAPI().info(new Info()
			.title(description)
			.version("1.0")
			.termsOfService("http://swagger.io/terms")
			.license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}

}
