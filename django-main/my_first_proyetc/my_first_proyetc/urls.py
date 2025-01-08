
from os import name
from django.contrib import admin
from django.urls import path
from my_first_app.views import my_view

urlpatterns = [
    path('admin/', admin.site.urls),
    path('car-list/', my_view)
]


