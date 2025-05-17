package gkm.events.keyboard;

import org.json.JSONObject;

import gkm.events.keyboard.GkmKeyEventType;

public class GkmKeyEvent {

    public GkmKeyEventType eventType;

    public int keyCode;

    public int rawCode;

    public GkmKeyEvent(GkmKeyEventType eventType, int keyCode, int rawCode) {
        this.eventType = eventType;
        this.keyCode = keyCode;
        this.rawCode = rawCode;
    }

    public String toJson() {
        JSONObject json = new JSONObject();
        json.put("eventType", eventType.name());
        json.put("keyCode", keyCode);
        json.put("rawCode", rawCode);
        return json.toString();
    }
}
