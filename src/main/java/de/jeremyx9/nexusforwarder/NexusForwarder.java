package de.jeremyx9.nexusforwarder;

import com.google.inject.Inject;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.plugin.Plugin;
import org.slf4j.Logger;

@Plugin(
        id = "nexus-forwarder",
        name = "Nexus Forwarder",
        version = "1.0-SNAPSHOT",
        description = "a forwarding plugin to be forwarded from the minecraft servers to others through interactions",
        authors = {"JeremyX9"}
)
public class NexusForwarder {

    @Inject
    private Logger logger;

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
    }
}
