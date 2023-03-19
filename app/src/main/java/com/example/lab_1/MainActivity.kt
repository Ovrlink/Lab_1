package com.example.lab_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var animalList: ArrayList<animals>
    private lateinit var animalAdapter:AnimalAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        animalList = ArrayList()
        animalList.add(animals(R.drawable.deer, "Олень", "Плямисті олені – стрункі тварини легкої статури. Влітку ці тварини червоно-руді з білими плямами, взимку – бурі. Шию плямистого оленя взимку прикрашає довга «грива». Біла пляма, розташована нижче хвоста, - «дзеркало» - допомагає оленям не втрачати один одного з виду, пересуваючись у лісі."))
        animalList.add(animals(R.drawable.owl, "Сова", "Звичайнісінька і численна сова України. Гніздиться навіть у міських парках. Сова вухата може повертати голову на 270 градусів.Вухату сову часто плутають з пугачем, але пугач набагато більший, до того ж його очі оранжевого кольору, а у сови – жовті. За даними кільцювання найстаріша вухата сова прожила 29 років і 9 місяців."))
        animalList.add(animals(R.drawable.elephant, "Слон", "Завдяки хоботу і величезним вухам, сірий могутній гігант викликає великий інтерес у дітей і дорослих.Великі вуха слона працюють як радіатори, рятуючи від перегріву. У спекотну погоду слони розставляють вуха, або розмахують ними, створюючи додатковий рух повітря.З метою гігієни слони приймають грязьові ванни. Бруд, що засихає, утворює панцир, який розчавлює і знищує паразитів, що мешкають в шкірі тварин."))
        animalAdapter = AnimalAdapter(animalList,this)
        recyclerView.adapter = animalAdapter

    }
}