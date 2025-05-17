package gkm;

import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseInputListener;
import org.jnativehook.mouse.NativeMouseWheelEvent;
import org.jnativehook.mouse.NativeMouseWheelListener;

import org.json.JSONObject;

import gkm.events.mouse.GkmMouseEvent;
import gkm.events.mouse.GkmMouseEventType;
import gkm.events.mouse.scroll.GkmScrollEvent;
import gkm.events.mouse.scroll.GkmScrollDirection;

public class GlobalMouseListener implements NativeMouseInputListener, NativeMouseWheelListener
{
	public void nativeMouseClicked(NativeMouseEvent e)
	{
		GkmMouseEvent event = new GkmMouseEvent(GkmMouseEventType.CLICKED, e.getX(), e.getY(), e.getButton(), e.getClickCount());
		System.out.println("mouse:" + event.toJson());
	}

	public void nativeMousePressed(NativeMouseEvent e)
	{
		GkmMouseEvent event = new GkmMouseEvent(GkmMouseEventType.MOVED, e.getX(), e.getY(), e.getButton(), e.getClickCount());
		System.out.println("mouse:" + event.toJson());
	}

	public void nativeMouseReleased(NativeMouseEvent e)
	{
		GkmMouseEvent event = new GkmMouseEvent(GkmMouseEventType.MOVED, e.getX(), e.getY(), e.getButton(), e.getClickCount());
		System.out.println("mouse:" + event.toJson());
	}

	public void nativeMouseMoved(NativeMouseEvent e)
	{
		GkmMouseEvent event = new GkmMouseEvent(GkmMouseEventType.MOVED, e.getX(), e.getY(), e.getButton(), e.getClickCount());
		System.out.println("mouse:" + event.toJson());
	}

	public void nativeMouseDragged(NativeMouseEvent e)
	{
	}

	public void nativeMouseWheelMoved(NativeMouseWheelEvent e)
	{
		GkmScrollEvent event = new GkmScrollEvent(GkmScrollDirection.fromInt(e.getWheelRotation()), e.getScrollAmount());
		System.out.println("mousewheel:" + event.toJson());
	}
}