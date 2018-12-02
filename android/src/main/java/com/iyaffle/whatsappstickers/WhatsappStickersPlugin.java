package com.iyaffle.whatsappstickers;

import com.iyaffle.whatsappstickers.classes.StickerContentProvider;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.Registrar;

/** WhatsappStickersPlugin */
public class WhatsappStickersPlugin implements MethodCallHandler {
  /** Plugin registration. */
  public static void registerWith(Registrar registrar) {
    final MethodChannel channel = new MethodChannel(registrar.messenger(), "whatsapp_stickers");
    channel.setMethodCallHandler(new WhatsappStickersPlugin());
  }

  @Override
  public void onMethodCall(MethodCall call, Result result) {
    if (call.method.equals("getStickerPackList")) {
      StickerContentProvider provider = new StickerContentProvider();
      result.success(provider.getStickerPackList());
    } else {
      result.notImplemented();
    }
  }
}
