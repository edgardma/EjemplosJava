package pe.com.dyd.ejemplos.spring.webflux.client.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import pe.com.dyd.ejemplos.spring.webflux.client.app.handler.ProductoHandler;

@Configuration
public class RouterConfig {
	
	@Bean
	public RouterFunction<ServerResponse> rutas(ProductoHandler handler) {
		return RouterFunctions.route(RequestPredicates.GET("/api/client"), handler::listar)
				.andRoute(RequestPredicates.GET("/api/client/{id}"), handler::ver);
	}
	
}
