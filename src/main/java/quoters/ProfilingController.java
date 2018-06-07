package quoters;

/**
 * Created by Shoma on 07.06.2018.
 */
public class ProfilingController implements ProfilingControllerMBean {
    private boolean enabled =  true;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
