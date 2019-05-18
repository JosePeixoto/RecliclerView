package fragmentos.app.com.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> bookList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bookList = new ArrayList<>();
        bookList.add(new Book("The Brazilian Open Championship", "27 a 29 SET | 2019", "Rua Oswaldo Araújo, 100 - Praia do Futuro", R.drawable.brazilianopen));
        bookList.add(new Book("WestCâmbio Brasil", "19 a 21 JUL | 2019", "Avenida Olegário Maciel, 1748 - Loudes", R.drawable.westcambio));
        bookList.add(new Book("Brasília Swing Brasil", "22 a 24 FEV | 2019", "Lá na Dança CLN 203, Bloco A", R.drawable.brasiliaswingbrasil));
        bookList.add(new Book("Swing Zouk Weekend", "30/May a 03/JUN | 2019", "Av. Manoel Mavignier, 6433 - Sabiaguaba", R.drawable.szw));

        RecyclerView recyclerView = findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, bookList);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(myAdapter);


    }
}
