package uk.co.panaxiom.playjongo;

import play.api.Configuration;
import play.api.Environment;
import play.api.inject.Binding;
import play.api.inject.Module;
import scala.collection.Seq;

/**
 * Play2.4 Module implementation.
 */
public class JongoModule extends Module {

    @Override
    public Seq<Binding<?>> bindings(Environment environment, Configuration configuration) {
        return seq(bind(PlayJongo.class).to(PlayJongo.class)
        );
    }
}