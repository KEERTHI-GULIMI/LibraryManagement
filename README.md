Day2 
ExecutorService  helps developers manage threads easily without having to manually handle thread creation, management, or shutdown.
A large number of independent tasks that can run concurrently (like downloading files, processing data, or sending emails).
To manage a pool of threads instead of manually handling thread creation.
Better control over the execution of asynchronous tasks, like getting results, handling timeouts, or cancelling tasks.
Concept wise it is a part of concurrency framework which have methods like submit in which we have collable and runnable 
where both are similar but collable will return the results of task.
Future.get retrieves the result of a task submitted to ExecutorService (if the task returns a value using Callable).
This method blocks until the task is completed.
shutdown() method  initiates an orderly shutdown in which previously submitted tasks are executed, but no new tasks will be accepted.
