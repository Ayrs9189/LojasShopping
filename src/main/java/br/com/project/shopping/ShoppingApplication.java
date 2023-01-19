package br.com.project.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ShoppingApplication {

	public static void main(String[] args) {

		SpringApplication.run(ShoppingApplication.class, args);

	}

	@GetMapping("/")
	public String index() {
		return "As leis morais com seus princípios, em todo conhecimento\n" +
				"prático, distinguem-se portanto de tudo o mais em que exista\n" +
				"qualquer coisa de empírico, e não só se distinguem essencialmente,\n" +
				"como também toda a Filosofia moral assenta inteiramente na sua\n" +
				"parte pura, e, aplicada ao homem, não recebe um mínimo que seja\n" +
				"do conhecimento do homem (Antropologia), mas fornece-lhe como\n" +
				"ser racional leis a priori. E verdade que estas exigem ainda uma\n" +
				"faculdade de julgar apurada pela experiência, para, por um lado,\n" +
				"distinguir em que caso elas têm aplicação, e, por outro, assegurarlhes entrada na vontade do homem e eficácia na sua prática. O\n" +
				"homem, com efeito, afectado por tantas inclinações, é na verdade\n" +
				"capaz de conceber a ideia de uma razão pura prática, mas não é\n" +
				"tão facilmente dotado da força necessária para a tornar eficaz in\n" +
				"concreto no seu comportamento.\n";
	}

}
