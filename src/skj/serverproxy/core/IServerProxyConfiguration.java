package skj.serverproxy.core;

import skj.serverproxy.core.models.ServerMode;

/**
 * Created by pwasiewicz on 16.03.14.
 */
public interface IServerProxyConfiguration {
    IServerProxyConfiguration onPort(int port);
    IServerProxyConfiguration onSSLPort(int port);
    IServerProxyConfiguration setMode(ServerMode mode);
    IServerProxyCore start();
}
