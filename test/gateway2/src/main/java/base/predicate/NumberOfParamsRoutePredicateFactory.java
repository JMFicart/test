package base.predicate;

import lombok.Getter;
import lombok.Setter;
import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.web.server.ServerWebExchange;

import java.util.function.Predicate;

public class NumberOfParamsRoutePredicateFactory extends AbstractRoutePredicateFactory<NumberOfParamsRoutePredicateFactory.Config> {

    public NumberOfParamsRoutePredicateFactory (){
        super(Config.class);
    }

    @Override
    public Predicate<ServerWebExchange> apply(Config config) {
        return (exchange) -> {return true;};
    }

    @Getter
    @Setter
    public static class Config {
        private Integer equals;
        private Integer min;
        private Integer max;
    }
}
