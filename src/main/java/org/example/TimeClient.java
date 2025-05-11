package org.example;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.ServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

public class TimeClient {
    public void connect(int port, String host) throws Exception {
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(group).
                    channel(NioSocketChannel.class).
                    option(ChannelOption.TCP_NODELAY,true)
                    .handler(new ChannelInitializer<ServerChannel>() {
                        @Override
                        protected void initChannel(ServerChannel ch) throws Exception {
                            // todo page 95
                        }
                    });
        } finally {

        }
    }
}
