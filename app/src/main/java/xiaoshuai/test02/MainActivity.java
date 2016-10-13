package xiaoshuai.test02;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/13.
 */
public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
/*//*
 List<String> listUrl = new ArrayList<String>();
 listUrl.add("http://fdfs.xmcdn.com/group16/M08/F1/13/wKgDbFal40bR7Uc6AAH3JpWhLiQ015_android_large.jpg");
 listUrl.add("http://fdfs.xmcdn.com/group10/M07/F0/14/wKgDaVal9ZLTP5q1AAFIJeYaktQ092_android_large.jpg");
 listUrl.add("http://fdfs.xmcdn.com/group12/M07/E8/35/wKgDXFacqEfReClFAAFvbZHe_mU331_android_large.jpg");
 listUrl.add("http://fdfs.xmcdn.com/group9/M05/EE/15/wKgDZlagtF_yH9YXAAEyq6YSxDo657_android_large.jpg");
 listUrl.add("http://fdfs.xmcdn.com/group11/M07/FC/B4/wKgDbValyzzy0fBpAAMdsEAuI-Q295_android_large.jpg");
 listUrl.add("http://fdfs.xmcdn.com/group9/M01/EF/02/wKgDZlaiCqbTzvIzAAH_l7MCT-k503_android_large.jpg");
 listUrl.add("http://fdfs.xmcdn.com/group9/M01/EF/02/wKgDZlaiCqbTzvIzAAH_l7MCT-k503_android_large.jpg");
 List<Product> mList = new ArrayList<Product>();
 for(int i=0;i<7;i++){
 Product product = new Product();
 //            product.setLocalPosition("res://mipmap/"+i+".png");
 product.setLocalPosition(listUrl.get(i));
 product.setProductName("Picture "+i);
 mList.add(product);
 }*/



        //模拟数据，这里需要获取图片的宽高 ，一般的在我们从服务器请求数据的 时候 它会返回图片的 宽高信息
        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.mipmap.p1);
        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.mipmap.p2);
        Bitmap bitmap3 = BitmapFactory.decodeResource(getResources(), R.mipmap.p3);
        Bitmap bitmap4 = BitmapFactory.decodeResource(getResources(), R.mipmap.p4);
        Bitmap bitmap5 = BitmapFactory.decodeResource(getResources(), R.mipmap.p5);
        Bitmap bitmap6 = BitmapFactory.decodeResource(getResources(), R.mipmap.p6);
        Bitmap bitmap7 = BitmapFactory.decodeResource(getResources(), R.mipmap.p7);

        List<Product> mList = new ArrayList<Product>();
        Product product1 = new Product("res://mipmap/"+R.mipmap.p1,"Picture 1",bitmap1.getWidth(),bitmap1.getHeight());
        Product product2 = new Product("res://mipmap/"+R.mipmap.p2,"Picture 2",bitmap2.getWidth(),bitmap2.getHeight());
        Product product3 = new Product("res://mipmap/"+R.mipmap.p3,"Picture 3",bitmap3.getWidth(),bitmap3.getHeight());
        Product product4 = new Product("res://mipmap/"+R.mipmap.p4,"Picture 4",bitmap4.getWidth(),bitmap4.getHeight());
        Product product5 = new Product("res://mipmap/"+R.mipmap.p5,"Picture 5",bitmap5.getWidth(),bitmap5.getHeight());
        Product product6 = new Product("res://mipmap/"+R.mipmap.p6,"Picture 6",bitmap6.getWidth(),bitmap6.getHeight());
        Product product7 = new Product("res://mipmap/"+R.mipmap.p7,"Picture 7",bitmap7.getWidth(),bitmap7.getHeight());
        mList.add(product1);
        mList.add(product2);
        mList.add(product3);
        mList.add(product4);
        mList.add(product5);
        mList.add(product6);
        mList.add(product7);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        PicRecyclerViewAdapter adapter = new PicRecyclerViewAdapter(mList,this);
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL));
        //添加间隔，Decorator 的翻译就是装饰师，粉刷匠
        MyItemDecorator myItemDecorator = new MyItemDecorator(2);
        mRecyclerView.addItemDecoration(myItemDecorator);

        mRecyclerView.setAdapter(adapter);
    }
}

