from django.contrib import admin
from .models import Task

# hacer visible desde el panel
@admin.register(Task)
class TaskAdmin(admin.ModelAdmin):
    list_display=['title']