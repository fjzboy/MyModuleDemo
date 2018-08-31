package debug;

import com.fjz.base.BaseApp;
import com.orhanobut.logger.Logger;

public class App extends BaseApp {
    @Override
    public void onCreate() {
        super.onCreate();
        Logger.i("on login module");
    }
}
