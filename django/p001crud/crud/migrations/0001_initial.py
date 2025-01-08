# Generated by Django 5.1.4 on 2025-01-06 09:10

from django.db import migrations, models


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Task',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('title', models.CharField(max_length=100)),
                ('description', models.TextField(blank=True)),
                ('is_created', models.BooleanField(default=False)),
                ('created', models.DateTimeField(auto_now=True)),
            ],
            options={
                'ordering': ['created'],
            },
        ),
    ]