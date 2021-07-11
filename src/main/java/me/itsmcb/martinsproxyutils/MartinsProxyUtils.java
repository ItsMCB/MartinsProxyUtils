package me.itsmcb.martinsproxyutils;

import com.google.inject.Inject;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.plugin.Plugin;
import org.slf4j.Logger;

@Plugin(
        id = "MartinsProxyUtils",
        name = "MartinsProxyUtils",
        version = "@version@",
        description = "Adds useful utilities to your Minecraft proxy.",
        url = "https://github.com/ItsMCB/MartinsProxyUtils",
        authors = {"ItsMCB"}
)
public class MartinsProxyUtils {

    @Inject
    private Logger logger;

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
    }
}
