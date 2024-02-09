package com.jelly.farmhelperv2.util.helper;

import java.awt.event.KeyEvent;
import org.lwjgl.input.Keyboard;

public class KeyCodeConverter {
    // hopefully all of them are correct - yuro
    public static int convertToAwtKeyCode(int lwjglKeyCode) {
        switch (lwjglKeyCode) {
            case Keyboard.KEY_LMENU: return KeyEvent.VK_ALT;
            case Keyboard.KEY_0: return KeyEvent.VK_0;
            case Keyboard.KEY_1: return KeyEvent.VK_1;
            case Keyboard.KEY_2: return KeyEvent.VK_2;
            case Keyboard.KEY_3: return KeyEvent.VK_3;
            case Keyboard.KEY_4: return KeyEvent.VK_4;
            case Keyboard.KEY_5: return KeyEvent.VK_5;
            case Keyboard.KEY_6: return KeyEvent.VK_6;
            case Keyboard.KEY_7: return KeyEvent.VK_7;
            case Keyboard.KEY_8: return KeyEvent.VK_8;
            case Keyboard.KEY_9: return KeyEvent.VK_9;
            case Keyboard.KEY_A: return KeyEvent.VK_A;
            case Keyboard.KEY_ADD: return KeyEvent.VK_ADD;
            case Keyboard.KEY_AT: return KeyEvent.VK_AT;
            case Keyboard.KEY_B: return KeyEvent.VK_B;
            case Keyboard.KEY_C: return KeyEvent.VK_C;
            case Keyboard.KEY_CIRCUMFLEX: return KeyEvent.VK_CIRCUMFLEX;
            case Keyboard.KEY_CLEAR: return KeyEvent.VK_CLEAR;
            case Keyboard.KEY_COLON: return KeyEvent.VK_COLON;
            case Keyboard.KEY_COMMA: return KeyEvent.VK_COMMA;
            case Keyboard.KEY_CONVERT: return KeyEvent.VK_CONVERT;
            case Keyboard.KEY_D: return KeyEvent.VK_D;
            case Keyboard.KEY_DECIMAL: return KeyEvent.VK_DECIMAL;
            case Keyboard.KEY_DELETE: return KeyEvent.VK_DELETE;
            case Keyboard.KEY_DIVIDE: return KeyEvent.VK_DIVIDE;
            case Keyboard.KEY_DOWN: return KeyEvent.VK_DOWN;
            case Keyboard.KEY_E: return KeyEvent.VK_E;
            case Keyboard.KEY_END: return KeyEvent.VK_END;
            case Keyboard.KEY_EQUALS:
            case Keyboard.KEY_NUMPADEQUALS: return KeyEvent.VK_EQUALS;
            case Keyboard.KEY_ESCAPE: return KeyEvent.VK_ESCAPE;
            case Keyboard.KEY_F: return KeyEvent.VK_F;
            case Keyboard.KEY_F1: return KeyEvent.VK_F1;
            case Keyboard.KEY_F10: return KeyEvent.VK_F10;
            case Keyboard.KEY_F11: return KeyEvent.VK_F11;
            case Keyboard.KEY_F12: return KeyEvent.VK_F12;
            case Keyboard.KEY_F13: return KeyEvent.VK_F13;
            case Keyboard.KEY_F14: return KeyEvent.VK_F14;
            case Keyboard.KEY_F15: return KeyEvent.VK_F15;
            case Keyboard.KEY_F16: return KeyEvent.VK_F16;
            case Keyboard.KEY_F17: return KeyEvent.VK_F17;
            case Keyboard.KEY_F18: return KeyEvent.VK_F18;
            case Keyboard.KEY_F19: return KeyEvent.VK_F19;
            case Keyboard.KEY_F2: return KeyEvent.VK_F2;
            case Keyboard.KEY_F3: return KeyEvent.VK_F3;
            case Keyboard.KEY_F4: return KeyEvent.VK_F4;
            case Keyboard.KEY_F5: return KeyEvent.VK_F5;
            case Keyboard.KEY_F6: return KeyEvent.VK_F6;
            case Keyboard.KEY_F7: return KeyEvent.VK_F7;
            case Keyboard.KEY_F8: return KeyEvent.VK_F8;
            case Keyboard.KEY_F9: return KeyEvent.VK_F9;
            case Keyboard.KEY_G: return KeyEvent.VK_G;
            case Keyboard.KEY_H: return KeyEvent.VK_H;
            case Keyboard.KEY_HOME: return KeyEvent.VK_HOME;
            case Keyboard.KEY_I: return KeyEvent.VK_I;
            case Keyboard.KEY_INSERT: return KeyEvent.VK_INSERT;
            case Keyboard.KEY_J: return KeyEvent.VK_J;
            case Keyboard.KEY_K: return KeyEvent.VK_K;
            case Keyboard.KEY_KANA: return KeyEvent.VK_KANA;
            case Keyboard.KEY_KANJI: return KeyEvent.VK_KANJI;
            case Keyboard.KEY_L: return KeyEvent.VK_L;
            case Keyboard.KEY_LEFT: return KeyEvent.VK_LEFT;
            case Keyboard.KEY_M: return KeyEvent.VK_M;
            case Keyboard.KEY_MINUS: return KeyEvent.VK_MINUS;
            case Keyboard.KEY_MULTIPLY: return KeyEvent.VK_MULTIPLY;
            case Keyboard.KEY_N: return KeyEvent.VK_N;
            case Keyboard.KEY_NUMPAD0: return KeyEvent.VK_NUMPAD0;
            case Keyboard.KEY_NUMPAD1: return KeyEvent.VK_NUMPAD1;
            case Keyboard.KEY_NUMPAD2: return KeyEvent.VK_NUMPAD2;
            case Keyboard.KEY_NUMPAD3: return KeyEvent.VK_NUMPAD3;
            case Keyboard.KEY_NUMPAD4: return KeyEvent.VK_NUMPAD4;
            case Keyboard.KEY_NUMPAD5: return KeyEvent.VK_NUMPAD5;
            case Keyboard.KEY_NUMPAD6: return KeyEvent.VK_NUMPAD6;
            case Keyboard.KEY_NUMPAD7: return KeyEvent.VK_NUMPAD7;
            case Keyboard.KEY_NUMPAD8: return KeyEvent.VK_NUMPAD8;
            case Keyboard.KEY_NUMPAD9: return KeyEvent.VK_NUMPAD9;
            case Keyboard.KEY_O: return KeyEvent.VK_O;
            case Keyboard.KEY_P: return KeyEvent.VK_P;
            case Keyboard.KEY_PAUSE: return KeyEvent.VK_PAUSE;
            case Keyboard.KEY_PERIOD: return KeyEvent.VK_PERIOD;
            case Keyboard.KEY_Q: return KeyEvent.VK_Q;
            case Keyboard.KEY_R: return KeyEvent.VK_R;
            case Keyboard.KEY_RIGHT: return KeyEvent.VK_RIGHT;
            case Keyboard.KEY_S: return KeyEvent.VK_S;
            case Keyboard.KEY_SEMICOLON: return KeyEvent.VK_SEMICOLON;
            case Keyboard.KEY_SLASH: return KeyEvent.VK_SLASH;
            case Keyboard.KEY_SPACE: return KeyEvent.VK_SPACE;
            case Keyboard.KEY_STOP: return KeyEvent.VK_STOP;
            case Keyboard.KEY_SUBTRACT: return KeyEvent.VK_SUBTRACT;
            case Keyboard.KEY_T: return KeyEvent.VK_T;
            case Keyboard.KEY_TAB: return KeyEvent.VK_TAB;
            case Keyboard.KEY_U: return KeyEvent.VK_U;
            case Keyboard.KEY_UP: return KeyEvent.VK_UP;
            case Keyboard.KEY_V: return KeyEvent.VK_V;
            case Keyboard.KEY_W: return KeyEvent.VK_W;
            case Keyboard.KEY_X: return KeyEvent.VK_X;
            case Keyboard.KEY_Y: return KeyEvent.VK_Y;
            case Keyboard.KEY_Z: return KeyEvent.VK_Z;
            case Keyboard.KEY_APOSTROPHE: return KeyEvent.VK_QUOTE;
            case Keyboard.KEY_APPS: return KeyEvent.VK_CONTEXT_MENU;
            case Keyboard.KEY_BACK: return KeyEvent.VK_BACK_SPACE;
            case Keyboard.KEY_BACKSLASH: return KeyEvent.VK_BACK_SLASH;
            case Keyboard.KEY_CAPITAL: return KeyEvent.VK_CAPS_LOCK;
            case Keyboard.KEY_GRAVE: return KeyEvent.VK_BACK_QUOTE;
            case Keyboard.KEY_LBRACKET: return KeyEvent.VK_OPEN_BRACKET;
            case Keyboard.KEY_LCONTROL: return KeyEvent.VK_CONTROL;
            case Keyboard.KEY_LSHIFT: return KeyEvent.VK_SHIFT;
            case Keyboard.KEY_LWIN:
            case Keyboard.KEY_RWIN: return KeyEvent.VK_WINDOWS;
            case Keyboard.KEY_NEXT: return KeyEvent.VK_PAGE_DOWN;
            case Keyboard.KEY_NOCONVERT: return KeyEvent.VK_NONCONVERT;
            case Keyboard.KEY_NUMLOCK: return KeyEvent.VK_NUM_LOCK;
            case Keyboard.KEY_NUMPADCOMMA: return KeyEvent.VK_SEPARATOR;
            case Keyboard.KEY_NUMPADENTER: return KeyEvent.VK_ENTER;
            case Keyboard.KEY_PRIOR: return KeyEvent.VK_PAGE_UP;
            case Keyboard.KEY_RBRACKET: return KeyEvent.VK_CLOSE_BRACKET;
            case Keyboard.KEY_SCROLL: return KeyEvent.VK_SCROLL_LOCK;
            case Keyboard.KEY_SYSRQ: return KeyEvent.VK_PRINTSCREEN;
            case Keyboard.KEY_UNDERLINE: return KeyEvent.VK_UNDERSCORE;
            default: return KeyEvent.VK_UNDEFINED;
        }
    }
}