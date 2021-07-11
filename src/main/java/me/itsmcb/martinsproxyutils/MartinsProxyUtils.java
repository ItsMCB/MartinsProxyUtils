package me.itsmcb.martinsproxyutils;

import com.google.inject.Inject;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.plugin.annotation.DataDirectory;
import com.velocitypowered.api.proxy.ProxyServer;
import org.slf4j.Logger;

import java.nio.file.Path;

@Plugin(
        id = "martinsproxyutils",
        name = "MartinsProxyUtils",
        version = "@version@",
        description = "Adds useful utilities to your Minecraft proxy.",
        url = "https://github.com/ItsMCB/MartinsProxyUtils",
        authors = {"ItsMCB"}
)
public class MartinsProxyUtils {

    private static ProxyServer server;
    private static Logger logger;
    private static Path dataDirectory;

    @Inject
    public MartinsProxyUtils(ProxyServer server, Logger logger,@DataDirectory Path dataDirectory) {
        MartinsProxyUtils.server = server;
        MartinsProxyUtils.logger = logger;
        MartinsProxyUtils.dataDirectory = dataDirectory;
    }

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        logger.info("Successfully enabled.");
    }
}
