package ${PACKAGE_NAME};

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import ${PACKAGE_NAME}.entities.ExampleListItem;
import ${PACKAGE_NAME}.models.ExampleModel;

/**
 * Created by kaoru on 15/06/15.
 */
public class ${NAME} extends BaseAdapter {
    private final LayoutInflater mLayoutInflater;
    private final ExampleModel mModel;

    public ${NAME}(LayoutInflater layoutInflater, ExampleModel model) {
        mLayoutInflater = layoutInflater;
        mModel = model;
    }

    @Override
    public int getCount() {
        return mModel.getCount();
    }

    @Override
    public ExampleListItem getItem(int position) {
        return mModel.getObjectAtIndex(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.top_list_item, parent, false);
        }
        
        if (convertView instanceof TopListItemView) {
            ((TopListItemView) convertView).setResultItem(getItem(position));
        }
        
        return null;
    }
}
