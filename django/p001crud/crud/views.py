from django.shortcuts import render, redirect
from .models import Task
from .form import TaskForm

def task_list_and_create(request):

    if request.method == 'POST':
        form = TaskForm(request.POST)
        if form.is_valid():
            form.save()
            return redirect('crud:crud_list')
    else:
        form = TaskForm()
    #tasks = Task.objects.all()
    complete_tasks = Task.objects.filter(is_completed=True)
    incomplete_tasks = Task.objects.filter(is_completed=False)

    return render(request, 'task_list.html',
                  {
                      'form':form,
                      #'tasks':tasks
                      'complete_tasks':complete_tasks,
                      'incomplete_tasks': incomplete_tasks
                  })
