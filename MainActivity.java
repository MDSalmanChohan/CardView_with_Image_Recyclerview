import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CardViewAdapter adapter;
    private List<DataModel> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataList = new ArrayList<>();
        dataList.add(new DataModel("Item 1", "Subtitle 1", R.drawable.image1));
        dataList.add(new DataModel("Item 2", "Subtitle 2", R.drawable.image2));
        dataList.add(new DataModel("Item 3", "Subtitle 3", R.drawable.image3));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CardViewAdapter(this, dataList);
        recyclerView.setAdapter(adapter);
    }
}
