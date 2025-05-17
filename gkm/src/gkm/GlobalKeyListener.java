package gkm;

import org.jnativehook.GlobalScreen;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

import gkm.events.keyboard.GkmKeyEvent;
import gkm.events.keyboard.GkmKeyEventType;

public class GlobalKeyListener implements NativeKeyListener {
	public void nativeKeyPressed(NativeKeyEvent e) {
		GkmKeyEvent event = new GkmKeyEvent(GkmKeyEventType.PRESSED, e.getKeyCode(), e.getRawCode());
		System.out.println("keyboard:" + event.toJson());
	}

	public void nativeKeyReleased(NativeKeyEvent e) {
		GkmKeyEvent event = new GkmKeyEvent(GkmKeyEventType.RELEASED, e.getKeyCode(), e.getRawCode());
		System.out.println("keyboard:" + event.toJson());
	}

	public void nativeKeyTyped(NativeKeyEvent e) {
		GkmKeyEvent event = new GkmKeyEvent(GkmKeyEventType.TYPED, e.getKeyCode(), e.getRawCode());
		System.out.println("keyboard:" + event.toJson());
	}
}