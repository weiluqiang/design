package ai.yunxi.observer.bell;

import java.util.EventListener;

public interface BellEventListener extends EventListener {

    //事件处理方法，听到铃声
    void heardBell(RingEvent e);
}
