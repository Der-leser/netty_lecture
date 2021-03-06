package com.chenfx.netty.firstexample;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.*;
import io.netty.util.CharsetUtil;

public class TestHttpServerHandler extends SimpleChannelInboundHandler<HttpObject> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, HttpObject msg) throws Exception {
        System.out.println(msg.getClass() + "----------------------------");
       if (msg instanceof HttpRequest) {
//           ByteBuf context = Unpooled.copiedBuffer("Hello World", CharsetUtil.UTF_8);
//           FullHttpResponse response = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK,context);
//           response.headers().set(HttpHeaderNames.CONTENT_TYPE, "text/plain");
//           response.headers().set(HttpHeaderNames.CONTENT_LENGTH, context.readableBytes());
//           ctx.writeAndFlush(response);
       }

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("--------------------active------------------------");
        super.channelActive(ctx);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("-----------------inactive---------------------------");
        super.channelInactive(ctx);
    }
}
