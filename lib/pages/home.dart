import 'package:flutter/material.dart';
import 'package:fossa/data/workout_data.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:provider/provider.dart';

class HomePage extends StatefulWidget {
  const HomePage({super.key});

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {

  final newWorkoutNameController = TextEditingController();

  void createNewWorkout(){
    showDialog(
      context: context,
      builder: (context) => AlertDialog(
        title: Text('Create new workout'),
        content: TextField(
          controller: newWorkoutNameController,
        ),
        actions:[
          MaterialButton(
            onPressed: save,
            child: Text('save'),
          ),
          MaterialButton(
            onPressed: cancel,
            child: Text('cancel'),
          ),
        ],
      )
    );
  }

  void save() {
    String newWorkoutName = newWorkoutNameController.text;
    Provider.of<WorkoutData>(context, listen: false).addWorkout(newWorkoutName);

    Navigator.pop(context);
    clear();
  }

  void cancel() {

  }

  void clear() {
    newWorkoutNameController.clear();
  }


  @override
  Widget build(BuildContext context) {
    return Consumer<WorkoutData>(
      builder: (context, value, child) => Scaffold(
        appBar: AppBar(
          title: Text(
            'FOSSA',
            style: GoogleFonts.exo2(
              textStyle: TextStyle(
                fontSize: 24,
                fontWeight: FontWeight.bold,
              ),
            ),
          ),
        ),
        floatingActionButton: FloatingActionButton(
          backgroundColor: Color.fromARGB(255, 222, 19, 5),
          onPressed: createNewWorkout,
          child: Icon(Icons.add, color: Colors.white,),
        ),
        body: ListView.builder(
          itemCount: value.getWorkoutList().length,
          itemBuilder: (context, index) => ListTile(
            title: Text(value.getWorkoutList()[index].name),
          )),
      ),
    );
  }
}
