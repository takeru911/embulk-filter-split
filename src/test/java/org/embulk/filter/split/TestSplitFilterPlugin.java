package org.embulk.filter.split;

import java.io.File;
import java.io.IOException;

import org.embulk.EmbulkEmbed;
import org.embulk.config.ConfigLoader;
import org.embulk.config.ModelManager;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;

public class TestSplitFilterPlugin {
//    @Test
//    public void test() throws IOException {
//        EmbulkEmbed embed = new EmbulkEmbed.Bootstrap().initialize();
//        ConfigLoader loader =
//            new ConfigLoader(new ModelManager(
//                Guice.createInjector(new AbstractModule() {
//                    @Override
//                    protected void configure() {
//                    }
//                }),
//                new ObjectMapper()));
//        embed.run(loader.fromYamlFile(new File("./test.yml")));
//    }
}
