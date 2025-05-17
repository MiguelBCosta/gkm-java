package gkm.events.mouse;

import gkm.events.mouse.GkmMouseEventType;
import org.json.JSONObject;

public class GkmMouseEvent {

    public GkmMouseEventType eventType;
    
    public int x;

    public int y;

    public int button;

    public int clickCount;    

    public GkmMouseEvent(GkmMouseEventType eventType, int x, int y, int button, int clickCount) {
        this.eventType = eventType;
        this.x = x;
        this.y = y;
        this.button = button;
        this.clickCount = clickCount;
    }

    public String toJson() {
        JSONObject json = new JSONObject();
        json.put("eventType", eventType.name());
        json.put("x", x);
        json.put("y", y);
        json.put("button", button);
        json.put("clickCount", clickCount);
        return json.toString();
    }
}
