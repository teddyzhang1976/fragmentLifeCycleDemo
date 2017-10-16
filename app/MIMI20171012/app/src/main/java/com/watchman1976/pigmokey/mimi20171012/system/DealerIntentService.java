package com.watchman1976.pigmokey.mimi20171012.system;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 *     [teddy]: 发牌员的职责
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class DealerIntentService extends IntentService {
    // TODO: Rename actions, choose action names that describe tasks that this
    // IntentService can perform, e.g. ACTION_FETCH_NEW_ITEMS
    private static final String ACTION_FOO = "com.example.teddy.mydezhousevice.action.FOO";
    private static final String ACTION_BAZ = "com.example.teddy.mydezhousevice.action.BAZ";

    // TODO: Rename parameters
    private static final String EXTRA_PARAM1 = "com.example.teddy.mydezhousevice.extra.PARAM1";
    private static final String EXTRA_PARAM2 = "com.example.teddy.mydezhousevice.extra.PARAM2";

    public DealerIntentService() {
        super("DealerIntentService");
    }

    /**
     * Starts this service to perform action Foo with the given parameters. If
     * the service is already performing a task this action will be queued.
     *
     * @see IntentService
     */
    // TODO: Customize helper method
    public static void startActionFoo(Context context, String param1, String param2) {
        Intent intent = new Intent(context, DealerIntentService.class);
        intent.setAction(ACTION_FOO);
        intent.putExtra(EXTRA_PARAM1, param1);
        intent.putExtra(EXTRA_PARAM2, param2);
        context.startService(intent);
    }

    /**
     * Starts this service to perform action Baz with the given parameters. If
     * the service is already performing a task this action will be queued.
     *
     * @see IntentService
     */
    // TODO: Customize helper method
    public static void startActionBaz(Context context, String param1, String param2) {
        Intent intent = new Intent(context, DealerIntentService.class);
        intent.setAction(ACTION_BAZ);
        intent.putExtra(EXTRA_PARAM1, param1);
        intent.putExtra(EXTRA_PARAM2, param2);
        context.startService(intent);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();
            final String param1;
            final String param2;
            switch(action){
                case ACTION_FOO:
                    param1 = intent.getStringExtra(EXTRA_PARAM1);
                    param2 = intent.getStringExtra(EXTRA_PARAM2);
                    handleActionFoo(param1, param2);
                    break;
                case ACTION_BAZ:
                    param1 = intent.getStringExtra(EXTRA_PARAM1);
                    param2 = intent.getStringExtra(EXTRA_PARAM2);
                    handleActionBaz(param1, param2);
                    break;
            }
        }
    }

    /**
     * Handle action Foo in the provided background thread with the provided
     * parameters.
     */
    private void handleActionFoo(String param1, String param2) {
        // TODO: Handle action Foo
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Handle action Baz in the provided background thread with the provided
     * parameters.
     */
    private void handleActionBaz(String param1, String param2) {
        // TODO: Handle action Baz
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
