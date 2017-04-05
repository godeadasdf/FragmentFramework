package UF;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import com.example.kangning.fragmentframework.R;


public class BaseFragment extends Fragment {

    protected final static int NORMAL = 0x00000;
    protected final static int ADD_STACK = 0x00001;

    protected <T extends BaseFragment> void presentFragment(T fragment, int flag) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.content, fragment);
        if (flag == ADD_STACK) {
            transaction.addToBackStack(getClass().getSimpleName());
        }
        transaction.commit();
    }

    protected <T extends BaseFragment> boolean removeFragmetFromStack(Class<T> clazz) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.remove()
    }

}
