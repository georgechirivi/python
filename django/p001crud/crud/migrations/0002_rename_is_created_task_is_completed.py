# Generated by Django 5.1.4 on 2025-01-06 22:08

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('crud', '0001_initial'),
    ]

    operations = [
        migrations.RenameField(
            model_name='task',
            old_name='is_created',
            new_name='is_completed',
        ),
    ]
