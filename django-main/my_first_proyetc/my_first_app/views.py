from multiprocessing import context
from django.shortcuts import render

# Create your views here.

def my_view(request):
    car_list =[
        {"title": "BMW"},
        {"title": "Mazda"}
    ]
    context = {
        "car_list": car_list
    }
    return render(request, "my_first_app/templates/car_list.html", context)
