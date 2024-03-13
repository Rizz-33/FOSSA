import 'package:fossa/models/exercise.dart';
import 'package:fossa/models/workout.dart';

class WorkoutData {
  List<Workout> workoutList = [
    Workout(
      name: 'Upper Body',
      exercises: [
        Exercise(
          name: 'Bicep Curls',
          weight: '10',
          reps: '10',
          sets: '3',
        ),
      ],
    )
  ];

  List<Workout> getWorkoutList() {
    return workoutList;
  }

  int numberOfExerciseInWorkout(String workoutName) {
    Workout relevantWorkout = getRelevantWorkout(workoutName);

    return relevantWorkout.exercises.length;
  }

  void addWorkout(String name) {
    workoutList.add(Workout(name: name, exercises: []));
  }

  void addExercise(String workoutName, String exerciseName, String weight, String reps, String sets) {
    Workout relevantWorkout = getRelevantWorkout(workoutName);

    relevantWorkout.exercises.add(
      Exercise(
        name: exerciseName,
        weight: weight,
        reps: reps,
        sets: sets
      )
    );
  }

  void checkOfExercise(String workoutName, String exerciseName) {
    Exercise relevantExercise = getRelevantExercise(workoutName, exerciseName);

    relevantExercise.isCompleted = !relevantExercise.isCompleted;
  }

  Workout getRelevantWorkout(String workoutName) {
    Workout relevantWorkout = workoutList.firstWhere((workout) => workout.name == workoutName);

    return relevantWorkout;
  }

  Exercise getRelevantExercise(String workoutName, String exerciseName) {
    Workout relevantWorkout = getRelevantWorkout(workoutName);

    Exercise relevantExercise = relevantWorkout.exercises.firstWhere((exercise) => exercise.name == exerciseName);

    return relevantExercise;
  }
}