package gkm.events.mouse.scroll;

import gkm.events.mouse.scroll.GkmScrollDirection;

import org.json.JSONObject;

public class GkmScrollEvent {

    public GkmScrollDirection direction;

    public int scrollAmount;

    public GkmScrollEvent(GkmScrollDirection direction, int scrollAmount) {
        this.direction = direction;
        this.scrollAmount = scrollAmount;
    }

    public String toJson() {
        JSONObject json = new JSONObject();
        json.put("direction", direction.name());
        json.put("scrollAmount", scrollAmount);
        return json.toString();
    }

}
