import 'dart:async';

import 'package:flutter/services.dart';

class WhatsappStickers {
  static const MethodChannel _channel =
      const MethodChannel('whatsapp_stickers');

  static Future<String> getStickerPackList() async {
    final version = await _channel.invokeMethod('getStickerPackList');
    return version;
  }
}
