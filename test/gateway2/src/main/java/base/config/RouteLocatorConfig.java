package base.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteLocatorConfig {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("to-print",
                        r -> r.path("/print/commonplace")
                                .and()
                                .method("GET")
                                .filters(f ->
                                        f.rewritePath("/print/(?<path>.*)", "/${path}")
//                                                .addRequestParameter("mon-param", "sa-valeur")
//                                                .retry(3)
                                )
                                .uri("lb://print-service")
                )
                .route("to-texte",
                        r -> r.path("/texte/commonplace")
                                .filters(f -> f.rewritePath("/texte/(?<path>.*)", "/${path}"))
                                .uri("lb://texte-service")
                )
//                .route("mot",
//                        r -> r.path("/mot")
//                                .and()
//                                .method("GET")
//                                .filters( ( req ) -> req.addRequestParameter("mot", "gateway"))
//                                .uri("lb://texte-service"))
                .build();
    }

}
